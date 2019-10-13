# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [VERSION 8] - 2018-02-13
### Added
- "value_elevation_downhill_interval" value to "actions_A" container, define elevation drop on interval
- "value_elevation_downhill_track" value to "actions_A" container, define elevation drop over track
- "value_elevation_uphill_interval" value to "actions_A" container, define elevation gain on interval
- "value_elevation_uphill_track" value to "actions_A" container, define elevation gain over track
### Removed
- "value_elevation_interval" value from "actions_A" container
- "value_elevation_track" value from "actions_A" container

## [VERSION 7] - 2018-01-04
### Added
- "value_altitude_current" value to "actions_A" container, define current GPS altitude value

## [VERSION 6] - 2017-04-09
### Added
- "value_cadence_interval" value to "actions_A" container, define cadence over recording interval
- "value_cadence_track" value to "actions_A" container, define cadence over whole recording
- "value_device_battery" value to "actions_A" container, define current battery value
- "value_energy_track" value to "actions_A" container, define burned energy over whole track
- "energy_E1" container with "kj" and "kcal" values, usable in "energy" actions

## [VERSION 5] - 2017-02-24
### Added
- 'value_XXX' parameters used for various notifications from "audio coach" feature
- optional container 'timer_T2' that may be used for example in above 'value_time_current' if we need different time compare to 'timer_T1'
- container 'paces_P1' that is used to format 'pace' values read by training manager
### Removed
- 'heart_rate_value'

## [VERSION 4] - 2015-07-13
### Added
- 'pass_point' and 'pass_point_dist' to 'actions_A'. It is for notification on a point that lay on a track (pass points, via point)

## [VERSION 3] - 2015-01-23
### Added
- 'heart_rate_value' to 'actions_A'
- second distance container 'distances_D2' (referenced by '%D2'). These values may be used in sentences like 'After xxx metres, turn'.
- container 'times_T1' used for formatting times as 'Time is xx minutes yy seconds'
- container 'speeds_V1' used for formatting speeds as 'Speed is xx kilometer per hour'
### Changed
- container 'distances_D' renamed to 'distances_D1' (referenced by '%D1'). Values in this container always say simple distance values like 'Distance is xxx metres'.
- container 'distances_D2' is optional and if it's same, just don't include it or you may use new parameter 'parent' with value to 'D1' (check en.tts)

## [VERSION 2] - 2014-01-12
### Added
- 'actions_A' for out of track notification - 'navigation_too_far_from_track'
- 'actions_A' for POI alert notification - 'poi_alert_point_X', 'poi_alert_X_points'
- required numbers for '11' and '12'
### Removed
- from 'distances_D' removed word 'after' !!. It's needed to put this work to all "actions_A" manually. Mainly to 'action_dist', 'arrive_at_dest_dist', 'turn_u-turn_dist', 'roundabout_dist' and 'roundabout_dist_exit'

## [VERSION 1] - 2013-11-27
### Added 
- to "numbers_N1" values "20", "30", "40", "60", "70", "90"

## [INIT] - 2013-11-26
- published