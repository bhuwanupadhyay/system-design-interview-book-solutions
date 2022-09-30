rm -rf business/ && rm -rf lbs/ && rm -rf gateway/ && rm -rf kubernetes/

jhipster import-jdl ./design/jhipster.jh

#find ./ -name '.editorconfig' -print0 | xargs -0 rm -rf
#find ./ -name '.prettierignore' -print0 | xargs -0 rm -rf
#find ./ -name '.prettierrc' -print0 | xargs -0 rm -rf
#find ./ -name 'package-lock.json' -print0 | xargs -0 rm -rf
#find ./ -name 'package.json' -print0 | xargs -0 rm -rf
#find ./ -name 'README.md' -print0 | xargs -0 rm -rf
#find ./ -type d -name "node_modules" -exec rm -rf {} +

find ./ -type d -name ".devcontainer" -exec rm -rf {} +
find ./ -name '.yo-rc.json' -print0 | xargs -0 rm -rf
find ./ -name 'sonar-project.properties' -print0 | xargs -0 rm -rf
find ./ -type d -name ".jhipster" -exec rm -rf {} +
find ./ -type d -name "docker" -exec rm -rf {} +
