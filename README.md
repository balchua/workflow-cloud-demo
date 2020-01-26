

Install Keycloak

`helm install keycloak --namespace workflow codecentric/keycloak`


Use Postman to trigger the workflow

Sample Payload:

```json
{
	"processDefinitionKey": "sampleproc-e9b76ff9-6f70-42c9-8dee-f6116c533a6d",
	"variables": {
		"firstName": "Paulo",
		"lastName": "Silva",
		"age": 25
	},
	"commandType": "StartProcessInstanceCmd",
	"payloadType": "StartProcessPayload"
}
```