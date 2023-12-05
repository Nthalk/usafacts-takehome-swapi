import React, {useEffect, useState} from 'react';
import useApi from "./ApiClient";
import {ReportsApiStarshipReport} from "./api-gen";
import {Container} from "@mui/material";
import StarshipReport from "./reports/StarshipReport";

export default function App() {
    const api = useApi()
    const [starships, setStarships] = useState<ReportsApiStarshipReport | null>(null)
    useEffect(() => {
        const req = api.reports.starships()
        req.then((res) => {
            setStarships(res)
        })
    },[api])
    return (
        <Container>
            {starships !== null && <StarshipReport report={starships}/>}
        </Container>
    );
}
