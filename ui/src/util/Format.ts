const Format = {
    number: (value: number | null | undefined) => {
        if (value === null || value === undefined || value === 0) return ''
        let num = new Intl.NumberFormat('en-US', {
            maximumFractionDigits: 2,
        }).format(value)
        // trim trailing zeros
        num = num.replace(/\.00$/, '')
        // convert thousands to K
        num = num.replace(/(\d+),(\d\d\d)$/, '$1K')
        // convert millions to M
        num = num.replace(/(\d+),(\d\d\d)K$/, '$1M')
        // convert billions to B
        num = num.replace(/(\d+),(\d\d\d)M$/, '$1B')
        // convert trillions to T
        num = num.replace(/(\d+),(\d\d\d)B$/, '$1T')
        return num
    },
    percent: (value: number) => {
        if (value === null || value === undefined || value === 0) return ''
        return new Intl.NumberFormat('en-US', {
            style: 'percent',
            maximumFractionDigits: 2,
        }).format(value)
    },
    currency: (value: number) => {
        if (value === null || value === undefined || value === 0) return ''
        let currency = new Intl.NumberFormat('en-US', {
            style: 'currency',
            currency: 'USD',
        }).format(value)
        // trim trailing zeros
        currency = currency.replace(/\.00$/, '')
        // convert thousands to K
        currency = currency.replace(/(\d+),(\d\d\d)$/, '$1K')
        // convert millions to M
        currency = currency.replace(/(\d+),(\d\d\d)K$/, '$1M')
        // convert billions to B
        currency = currency.replace(/(\d+),(\d\d\d)M$/, '$1B')
        // convert trillions to T
        currency = currency.replace(/(\d+),(\d\d\d)B$/, '$1T')

        return currency
    }
}
export default Format
