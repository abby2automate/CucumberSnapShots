$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Scenario_DocString.feature");
formatter.feature({
  "line": 1,
  "name": "First Script and DocString",
  "description": "",
  "id": "first-script-and-docstring",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "DocString",
  "description": "",
  "id": "first-script-and-docstring;docstring",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@WithExtentReport"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Load Make my Trip Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Check the Following Dock String",
  "keyword": "And ",
  "doc_string": {
    "content_type": "",
    "line": 17,
    "value": "The leading player in online flight bookings in India, MakeMyTrip offers great offers, some of the lowest airfares, exclusive discounts and a seamless online booking experience. Flight, hotel and holiday bookings through the desktop or mobile site is a delightfully customer friendly experience, and with just a few clicks you can complete your booking. With features like Instant Discounts, Fare Calendar, MyRewards Program, MyWallet and many more, the overall booking experience with MakeMyTrip constantly adds value to its product and continues to offer the best to its customers.\n"
  }
});
formatter.match({
  "location": "Scenario_DocString.load_Make_my_Trip_Page()"
});
formatter.result({
  "duration": 17271311588,
  "status": "passed"
});
formatter.match({
  "location": "Scenario_DocString.check_the_Following_Dock_String(String)"
});
formatter.result({
  "duration": 123353581,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat com.test.stepdefinition.Scenario_DocString.check_the_Following_Dock_String(Scenario_DocString.java:90)\r\n\tat ✽.And Check the Following Dock String(src/test/resources/Scenario_DocString.feature:16)\r\n",
  "status": "failed"
});
});