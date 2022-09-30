k3d registry create registry --port 12345
k3d cluster create cluster --registry-use k3d-registry:12345
k3d kubeconfig merge cluster --kubeconfig-switch-context