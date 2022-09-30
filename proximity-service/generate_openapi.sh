# https://openapi-generator.tech/docs/generators/spring

groupId="io.github.bhuwanupadhyay"

for i in business lbs ; do
  basePackage="$groupId.$i.openapi"
  artifactId="$i"
  configPackage="$basePackage.config"
  apiPackage="$basePackage.api"
  invokerPackage="$basePackage.invoker"
  modelPackage="$basePackage.model"
  npx @openapitools/openapi-generator-cli generate \
    -i ./design/$i.yaml \
    -g spring \
    -o ./$i/ \
    --additional-properties=groupId=$groupId \
    --additional-properties=artifactId=$artifactId \
    --additional-properties=basePackage=$basePackage \
    --additional-properties=configPackage=$configPackage \
    --additional-properties=apiPackage=$apiPackage \
    --additional-properties=invokerPackage=$invokerPackage \
    --additional-properties=modelPackage=$modelPackage \
    --additional-properties=delegatePattern=true \
    -c ./design/generate_openapi.yaml
done

# Remove: file
find ./ -name '.openapi-generator-ignore' -print0 | xargs -0 rm -rf
find ./ -name 'README.md' -print0 | xargs -0 rm -rf
find ./ -name 'openapitools.json' -print0 | xargs -0 rm -rf
find ./ -name 'OpenApiGeneratorApplication.java' -print0 | xargs -0 rm -rf
find ./ -name 'OpenApiGeneratorApplicationTests.java' -print0 | xargs -0 rm -rf
find ./ -name 'ApiUtil.java' -print0 | xargs -0 rm -rf

# Remove: directory
find ./ -type d -name ".openapi-generator" -exec rm -rf {} +
