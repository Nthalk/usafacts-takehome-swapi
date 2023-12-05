import {styled, Table} from "@mui/material";

const StyledTable = styled(Table)`
  tbody tr {
    cursor: pointer;

    

    background-color: #f5f5f5;

    &:nth-child(odd) {
      background-color: #ffffff;
    }
    &:hover {
      background-color: #cfffb5;
    }
  }

  thead th {
    font-weight: bold;
    text-align: left;
    background-color: #f5f5f5;
  }
`
export default StyledTable
