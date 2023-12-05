/* tslint:disable */
/* eslint-disable */

export interface HttpClient {

    request<R>(requestConfig: { method: string; url: string; queryParams?: any; data?: any; copyFn?: (data: R) => R; }): RestResponse<R>;
}

export class ReportsApiClient {

    constructor(protected httpClient: HttpClient) {
    }

    /**
     * HTTP POST /api/reports/starship
     * Java method: usafacts.galactic.spending.app.api.ReportsApi.starships
     */
    starships(): RestResponse<ReportsApiStarshipReport> {
        return this.httpClient.request({ method: "POST", url: uriEncoding`api/reports/starship` });
    }
}

export interface Function<T, R> {
}

export interface RecordMapper<R, E> extends Function<R, E> {
}

export interface ReportsApiStarshipReport {
    episodes: ReportsApiStarshipReportEpisode[];
    starships: ReportsApiStarshipReportStarship[];
}

export interface ReportsApiStarshipReportEpisode {
    avgAverageCargoCapacity: number;
    avgAverageLength: number;
    avgCost: number;
    avgCostPerCargoSize: number;
    avgCostPerLength: number;
    episode: number;
    totalCargoCapacity?: Nullable<number>;
    totalCost: number;
    totalLength: number;
    totalShips: number;
}

export interface ReportsApiStarshipReportStarship {
    cargoCapacity?: Nullable<number>;
    costInCredits?: Nullable<number>;
    episodesSeenIn: number;
    firstEpisodeSeenIn: number;
    length: number;
    name: string;
    starshipClass: string;
}

export interface ReportsApistarships1<R, E> extends RecordMapper<any, any> {
}

export interface ReportsApistarships2<R, E> extends RecordMapper<any, any> {
}

export type Nullable<T> = T | null | undefined;

export type RestResponse<R> = Promise<R>;

function uriEncoding(template: TemplateStringsArray, ...substitutions: any[]): string {
    let result = "";
    for (let i = 0; i < substitutions.length; i++) {
        result += template[i];
        result += encodeURIComponent(substitutions[i]);
    }
    result += template[template.length - 1];
    return result;
}
