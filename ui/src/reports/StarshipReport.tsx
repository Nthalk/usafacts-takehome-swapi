import {ReportsApiStarshipReport} from "../api-gen";
import {List, ListItem, Typography} from "@mui/material";
import React, {useMemo} from "react";
import WarningCard from "../common/WarningCard";
import GraphCard from "../common/GraphCard";
import Format from "../util/Format";
import {ResponsiveBar} from "@nivo/bar";
import ReportContainer from "../common/ReportContainer";
import {ResponsiveBarSvgProps} from "@nivo/bar/dist/types/ResponsiveBar";
import {BarDatum} from "@nivo/bar/dist/types/types";
import Note from "../common/Note";
import {Info} from "@mui/icons-material";
import {LineSvgProps, ResponsiveLine} from "@nivo/line";
import Hero from "../common/Hero";
import StyledTable from "../common/StyledTable";


export default function StarshipReport(
    props: {
        report: ReportsApiStarshipReport
    }
) {
    const report = props.report

    const stats = useMemo(() => {
        const deathStar = report.starships.find((ship) => ship.name === "Death Star")
        const allShipCosts = report.starships.map((ship) => ship.costInCredits ?? 0)

        function episodeColor(episode: number) {
            if (episode === 1) return "hsl(0,98%,54%)"
            if (episode === 2) return "hsl(23,98%,53%)"
            if (episode === 3) return "hsl(46,93%,60%)"
            if (episode === 4) return "hsl(80,100%,50%)"
            if (episode === 5) return "hsl(157,100%,50%)"
            if (episode === 6) return "hsl(205,100%,50%)"
            return "hsl(0,0%,0%)"
        }


        return {
            costOfDeathStar: deathStar?.costInCredits ?? 0,
            costOfAllShips: allShipCosts.reduce((a, b) => a + b, 0),
            episodeShipCosts: report.episodes.map((episode) => {
                return {
                    id: episode.episode,
                    color: episodeColor(episode.episode),
                    label: "Episode " + episode.episode,
                    value: episode.totalCost
                }
            }),
            episodeCostPerShip: report.episodes.map((episode) => {
                return {
                    id: episode.episode,
                    color: episodeColor(episode.episode),
                    label: "Episode " + episode.episode,
                    value: episode.avgCost
                }
            }),
            episodeCostQuality:
                (["avgCost", "avgCostPerLength"] as const).map((dimension) => {
                    return {
                        id: dimension,
                        label: dimension,
                        data: report.episodes.map((episode) => {
                            return {
                                x: episode.episode,
                                y: episode[dimension]
                            }
                        })
                    }
                }),
            episodeCostPerCargoCapacity: [
                {
                    id: "Cost / Cargo Capacity",
                    label: "Cost / Cargo Capacity",
                    data: report.episodes.map((episode) => {
                        return {
                            x: episode.episode,
                            y: episode.avgCostPerCargoSize
                        }
                    })
                },
            ]
        }
    }, [report.episodes, report.starships])

    const defaultBarProps: Partial<ResponsiveBarSvgProps<BarDatum>> = useMemo(() => ({
        enableGridX: true,
        label: (d) => Format.currency(d.value ?? 0),
        margin: {top: 10, right: 10, bottom: 50, left: 10},
        axisLeft: {
            tickValues: [],
            legend: 'credits',
            legendPosition: 'middle',
        },
        colorBy: "indexValue",
        axisTop: null,
        axisRight: null,
        axisBottom: {
            tickSize: 5,
            tickPadding: 5,
            tickRotation: 0,
            legend: 'Episode',
            legendPosition: 'middle',
            legendOffset: 32,
            truncateTickAt: 0
        },
        valueScale: {
            type: "symlog"
        }
    }), [])

    const defaultLineProps: Partial<LineSvgProps> = useMemo(() => ({
        margin: {top: 50, right: 20, bottom: 50, left: 150},
        pointSize: 10,
        enableCrosshair: true,
        useMesh: true,
        axisTop: null,
        axisRight: null,
        axisLeft: {
            tickValues: 0,
            legend: 'credits',
            legendOffset: -40,
            legendPosition: 'middle'
        },
        axisBottom: {
            legend: 'Episode',
            legendPosition: 'middle',
            legendOffset: 32,
        },

        xScale: {type: 'point'},
        yScale: {type: 'symlog', min: 'auto', max: 'auto', reverse: true},
        legends: [
            {
                anchor: 'bottom-left',
                direction: 'column',
                justify: false,
                translateX: -140,
                translateY: 0,
                itemsSpacing: 0,
                itemDirection: 'left-to-right',
                itemWidth: 80,
                itemHeight: 20,
                itemOpacity: 0.75,
                symbolSize: 12,
                symbolShape: 'circle',
                symbolBorderColor: 'rgba(0, 0, 0, .5)',
                effects: [
                    {
                        on: 'hover',
                        style: {
                            itemBackground: 'rgba(0, 0, 0, .03)',
                            itemOpacity: 1
                        }
                    }
                ]
            }
        ]
    }), [])

    return <ReportContainer>
        <Hero>
            <Typography variant="h4">
                Starship Report
            </Typography>
            <Typography>
                Is warship spending out of control? Are we getting the best value for our credits? Let's take a dive
                into the SWAPI data and find out!
            </Typography>
        </Hero>
        <Typography>
            Whether you support the Empire or the Rebels, objective judgements can be made about
            the quality of economic decision making when purchasing utility.
        </Typography>
        <WarningCard>
            <Typography>
                Our datasource is the Star Wars API, which is a free, open source API with data about the Star
                Wars,
                however,
                it has some problems we should address first:
            </Typography>
            <List>
                <ListItem>
                    <Typography>
                        Only have access to the first 6 major episodes (no Rogue One, Solo, Mandalorian, etc)
                    </Typography>
                </ListItem>
                <ListItem>
                    <Typography>
                        There are only 36 ships in the repository, and only 26 with a known cost,
                        leaving per-episode ship counts as low as 2, (this is not good for trustable statistics
                        gathering).
                    </Typography>
                </ListItem>
                <ListItem>
                    <Typography>
                        The number of ships per ship class is 1 on average, making cross ship comparisons
                        difficult
                    </Typography>
                </ListItem>
                <ListItem>
                    <Typography>
                        Total ship count purchases are unavailable
                    </Typography>
                </ListItem>
                <ListItem>
                    <Typography>
                        Purchase dates are also unavailable, so we will use the first episode a ship is seen in as a
                        proxy
                    </Typography>
                </ListItem>
            </List>
        </WarningCard>

        <Typography>
            It appears that the total spend on ships is trending downwards, despite a recent uptick in spending.
        </Typography>

        <GraphCard style={{height: 500}}>
            <ResponsiveBar
                {...defaultBarProps}
                data={stats.episodeShipCosts}
            />
        </GraphCard>
        <Note icon={<Info/>}>
            Did you know:
            the Death Star represents {Format.percent(stats.costOfDeathStar / stats.costOfAllShips)} of all ship costs,
            at {Format.currency(stats.costOfDeathStar)} credits!
        </Note>

        <Typography>
            When looking into cost per ship, we see a similar trend, however we should expect that increases in
            technology should lead to a decrease in cost per ship, or an increase in ship value.
        </Typography>

        <Typography>
            Using length as a proxy for material cost, we can see that the cost per value appears to be flat or
            worsening:
        </Typography>

        <GraphCard style={{height: 500}}>
            <ResponsiveLine
                {...defaultLineProps}
                data={stats.episodeCostQuality}
            />
        </GraphCard>
        <Note icon={<Info/>}>
            The Death Star represents a decent value when considering cost per length, considering it is round and has
            the
            most material volume per length of any ship!
        </Note>

        <Typography>
            How about cargo capacity? Here we can see a general trend of increasing cargo capacity costs, with fall off
            towards the end, however, episode 2 has the lowest cost per cargo. Why is that?
        </Typography>
        <GraphCard style={{height: 500}}>
            <ResponsiveLine
                {...defaultLineProps}
                data={stats.episodeCostPerCargoCapacity}
                yScale={{type: 'linear', min: 0, max: 'auto'}}
            />
        </GraphCard>
        <Note icon={<Info/>}>
            Once again, the Death Star appears to be an above average value in terms of cargo capacity per cost!
        </Note>

        <Typography>
            Hold on, Episode 2 has a terrific cargo capacity per cost. 3! What's going on here?
        </Typography>

        <Typography>
            Let's look at the ships in Episode 2:
        </Typography>
        <GraphCard style={{padding: "1em"}}>
            <StyledTable>
                <thead>
                <tr>
                    <th align="left">Episode</th>
                    <th align="left">Ship</th>
                    <th align="left">Cost</th>
                    <th align="left">Cargo Capacity</th>
                    <th align="left">Cost / Cargo Capacity</th>
                    <th align="left">Cost / Length</th>
                </tr>
                </thead>
                <tbody>
                {report.starships
                    .filter(ship => ship.cargoCapacity && ship.costInCredits)
                    .map((ship) => {
                        return <tr key={ship.name}>
                            <td>{ship.firstEpisodeSeenIn}</td>
                            <td>{ship.name}</td>
                            <td>{Format.currency(ship.costInCredits ?? 0)}</td>
                            <td>{Format.number(ship.cargoCapacity)}</td>
                            <td>{
                                (!ship.cargoCapacity || !ship.costInCredits) ? "N/A" :
                                    Format.currency(ship.costInCredits / ship.cargoCapacity)
                            }</td>
                            <td>{
                                (!ship.costInCredits || !ship.length) ? "N/A" :
                                    Format.currency(ship.costInCredits / ship.length)
                            }</td>
                        </tr>
                    })}
                </tbody>
            </StyledTable>
        </GraphCard>
        <Typography>
            Here we can see that cargo cost is wildly variable, and the only thing that Episode 2 did correctly, was
            not make terrible price/cargo purchases.
        </Typography>
        <Typography>
            When shipping cargo, at 1 credit per cargo capacity, the Millennium Falcon is the best value given both
            the speed of the ship, as well as the cost per cargo capacity.
        </Typography>
        <Note icon={<Info/>}>
            Once again, the Death Star tops the list in terms of cargo capacity per cost!
        </Note>
        <Hero>
            <Typography variant="h4">
                Conclusion
            </Typography>
            <Typography>
                While spending is definitely trending down, this appears mostly due the the Death Star being a one time
                purchase, however, there is a lot of wasted money on ships that are not cost effective.
            </Typography>
            <Typography>
                The Millennium Falcon appears to be the best ship on the market, with a cost / length ratio of 2k, a
                cost per cargo capacity of 1, all while being the fastest ship in the galaxy.
            </Typography>
            <Typography>
                The recommendation of this report is to stop building anything other than the Millennium Falcon, and
                investigate fraud in the ship purchasing departments.
            </Typography>
        </Hero>
    </ReportContainer>
}
