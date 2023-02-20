#Author: Daniel
Feature: As a user, buttons are located by coordinates within a matrix

  Background: Login on page
    Given Authentication user
      | user  |   key     |
      | 548247 | 10df2f32286b7120My0zLTc0Mjg0NQ==30e0c83e6c29f1c3  |
  @scenario
  Scenario: Find the correct button in the matrix
    When Calculate the correct coordinate of the button and the sum
    Then get a hash


