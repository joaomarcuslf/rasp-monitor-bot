# Change Log

## 1.1.2 - ON GOING
### Fix
- Commands authorization(is-owner)
### Changed
- Added tests
- Refactor all commands

## 1.0.5 - Break Change
### Remove /command in favor of:
- /ls
- /shutdown
- /reboot

## 1.0.3 - Cancel
### Changed
- Split the commands when executing

## 1.0.2 - 2017-03-14
### Added
- Fix no output on /command
### Changed
- Updated /help commands

## 1.0.0 - 2017-03-11
### Added
- /howru option with gif
- tests, tests, tests

## 0.2.0 - 2017-03-11
### Changed
- Split core.clj into:
	- configs.clj where the configuration vars will be
	- core.clj the bot initializer
	- formatters.clj where the formatters of string, int or floats will be
	- handlers.clj where the handlers commands will be
	- helpers.clj where the helpers function will be


## 0.1.5 - 2017-03-11
### Added
- /command command with username validator
- /changelog command
- /temp command
### Changed
- Refactor morse modules names
- Refactor help commands

## 0.1.0-SNAPSHOT - 2017-03-11
### Added
- Added repl capabilities
- Not-found command
- /repo command
- /version command
- /hello command
- /help command
- /start command
- Initial Project
