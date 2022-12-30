 sbt clean coverage "testOnly * -- -l ExcludeFromCoverage" 
 sbt "testOnly * -- -n ExcludeFromCoverage" coverageReport
 