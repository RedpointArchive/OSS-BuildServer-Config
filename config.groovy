organizationFolder('Protobuild') {
  displayName('Protobuild')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('Protobuild')
      credentialsId('redpoint-jenkins-oss-organisation-scanning')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
  }
}

organizationFolder('RedpointGames') {
  displayName('Redpoint Games')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('RedpointGames')
      credentialsId('redpoint-jenkins-oss-organisation-scanning')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
  }
}

organizationFolder('HiveMP') {
  displayName('HiveMP')
  triggers {
      periodic(86400)
  }
  orphanedItemStrategy {
    discardOldItems {
    }
  }
  configure { folder ->
    folder / 'navigators' / 'org.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator'(plugin: 'github-branch-source@2.2.3') {
      repoOwner('HiveMP')
      credentialsId('redpoint-jenkins-oss-organisation-scanning')
      traits {
        'org.jenkinsci.plugins.github__branch__source.BranchDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.OriginPullRequestDiscoveryTrait' {
          strategyId(1)
        }
        'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
          strategyId(1)
          trust(class: 'org.jenkinsci.plugins.github_branch_source.ForkPullRequestDiscoveryTrait$TrustContributors')
        }
      }
    }
  }
}