import {useMemo} from "react";
import {HttpClient, ReportsApiClient, RestResponse} from "./api-gen";

export default function useApi() {
    return useMemo(() => {
        const client: HttpClient = {
            request<R>(requestConfig: {
                method: string;
                url: string;
                queryParams?: any;
                data?: any;
                copyFn?: (data: R) => R;
            }): RestResponse<R> {
                const url = `/${requestConfig.url}${requestConfig.queryParams
                    ? `?${Object.keys(requestConfig.queryParams)
                        .map(k => `${encodeURIComponent(k)}=${encodeURIComponent(requestConfig.queryParams[k] as string)}`)
                        .join("&")}`
                    : ""}`
                return fetch(url, {
                    method: requestConfig.method,
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(requestConfig.data)
                }).then(response => {
                    return response.json()
                })
            }
        }
        return {
            httpClient: client,
            reports: new ReportsApiClient(client)
        }
    }, [])
}
