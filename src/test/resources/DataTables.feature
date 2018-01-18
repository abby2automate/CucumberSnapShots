Feature: DataTables.feature

  Scenario: DataTable using LIST
    Given The DataTables test
    When The data is
      | First | abc |
      | Last  | xyz |
    Then End Testing

  Scenario: DataTable using Map
    Given The DataTables test using Map
    When The data for Map is
      | First | Last | Age | No |
      | a     | b    |   1 |  2 |
      | y     | z    |   8 |  9 |
    Then End Testing using Map

  Scenario: DataTable using POJO
    Given The DataTables test using POJO
    When The data for POJO is
      | data1 | data2 | data3 | data4 |
      | a     | b     |     1 |     2 |
      | y     | z     |     8 |     9 |
      | p     | q     |     4 |     5 |
    Then End Testing using POJO

  Scenario Outline: DataTable using Outline
    Given The DataTables test using Outline
    When The data <Data1> and <Data2>
    Then End Testing using Outline

    Examples: 
      | Data1 | Data2 |
      |    10 |    20 |
      |    60 |    70 |

  Scenario: Parameterization
    Given The data for Parameterization is "130" and "140"
