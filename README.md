# pmd-unnecessary-cast-false-positive

This repo shall help to repoduce an issue with PMD https://github.com/pmd/pmd/issues/5073

## Error message

```
[INFO] PMD version: 7.2.0
[INFO] 
[INFO] <<< maven-pmd-plugin:3.22.0:check (pmd) < :pmd @ pmd-unnecessary-cast-false-positive <<<
[INFO] 
[INFO] 
[INFO] --- maven-pmd-plugin:3.22.0:check (pmd) @ pmd-unnecessary-cast-false-positive ---
[INFO] PMD version: 7.2.0
[INFO] PMD Failure: org.example.Main:11 Rule:UnnecessaryCast Priority:3 Unnecessary cast (Seq<String>).
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.534 s
[INFO] Finished at: 2024-06-18T16:57:24Z
[INFO] ------------------------------------------------------------------------
Error:  Failed to execute goal org.apache.maven.plugins:maven-pmd-plugin:3.22.0:check (pmd) on project pmd-unnecessary-cast-false-positive:
You have 1 PMD violation. For more details see: /home/runner/work/pmd-unnecessary-cast-false-positive/pmd-unnecessary-cast-false-positive/target/pmd.xml -> [Help 1]
```
