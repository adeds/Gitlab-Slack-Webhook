package id.ade.ktorwebhooksample.models.receive


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GitlabMergeRequestReceiver(
    @SerialName("assignees")
    val assignees: List<Assignee?>? = null,
    @SerialName("changes")
    val changes: Changes? = null,
    @SerialName("event_type")
    val eventType: String? = null,
    @SerialName("labels")
    val labels: List<String?>? = null,
    @SerialName("object_attributes")
    val objectAttributes: ObjectAttributes? = null,
    @SerialName("object_kind")
    val objectKind: String? = null,
    @SerialName("project")
    val project: Project? = null,
    @SerialName("repository")
    val repository: Repository? = null,
    @SerialName("user")
    val user: User? = null
) {
    @Serializable
    data class Assignee(
        @SerialName("avatar_url")
        val avatarUrl: String? = null,
        @SerialName("email")
        val email: String? = null,
        @SerialName("id")
        val id: Int? = null,
        @SerialName("name")
        val name: String? = null,
        @SerialName("username")
        val username: String? = null
    )

    @Serializable
    class Changes

    @Serializable
    data class ObjectAttributes(
        @SerialName("assignee_id")
        val assigneeId: Int? = null,
        @SerialName("assignee_ids")
        val assigneeIds: List<Int?>? = null,
        @SerialName("author_id")
        val authorId: Int? = null,
        @SerialName("blocking_discussions_resolved")
        val blockingDiscussionsResolved: Boolean? = null,
        @SerialName("created_at")
        val createdAt: String? = null,
        @SerialName("description")
        val description: String? = null,
        @SerialName("head_pipeline_id")
        val headPipelineId: Int? = null,
        @SerialName("human_time_change")
        val humanTimeChange: String? = null,
        @SerialName("human_time_estimate")
        val humanTimeEstimate: String? = null,
        @SerialName("human_total_time_spent")
        val humanTotalTimeSpent: String? = null,
        @SerialName("id")
        val id: Int? = null,
        @SerialName("iid")
        val iid: Int? = null,
        @SerialName("last_commit")
        val lastCommit: LastCommit? = null,
        @SerialName("last_edited_at")
        val lastEditedAt: String? = null,
        @SerialName("last_edited_by_id")
        val lastEditedById: String? = null,
        @SerialName("merge_commit_sha")
        val mergeCommitSha: String? = null,
        @SerialName("merge_error")
        val mergeError: String? = null,
        @SerialName("merge_params")
        val mergeParams: MergeParams? = null,
        @SerialName("merge_status")
        val mergeStatus: String? = null,
        @SerialName("merge_user_id")
        val mergeUserId: Int? = null,
        @SerialName("merge_when_pipeline_succeeds")
        val mergeWhenPipelineSucceeds: Boolean? = null,
        @SerialName("milestone_id")
        val milestoneId: String? = null,
        @SerialName("source")
        val source: Source? = null,
        @SerialName("source_branch")
        val sourceBranch: String? = null,
        @SerialName("source_project_id")
        val sourceProjectId: Int? = null,
        @SerialName("state")
        val state: String? = null,
        @SerialName("state_id")
        val stateId: Int? = null,
        @SerialName("target")
        val target: Target? = null,
        @SerialName("target_branch")
        val targetBranch: String? = null,
        @SerialName("target_project_id")
        val targetProjectId: Int? = null,
        @SerialName("time_change")
        val timeChange: Int? = null,
        @SerialName("time_estimate")
        val timeEstimate: Int? = null,
        @SerialName("title")
        val title: String? = null,
        @SerialName("total_time_spent")
        val totalTimeSpent: Int? = null,
        @SerialName("updated_at")
        val updatedAt: String? = null,
        @SerialName("updated_by_id")
        val updatedById: String? = null,
        @SerialName("url")
        val url: String? = null,
        @SerialName("work_in_progress")
        val workInProgress: Boolean? = null
    ) {
        @Serializable
        data class LastCommit(
            @SerialName("author")
            val author: Author? = null,
            @SerialName("id")
            val id: String? = null,
            @SerialName("message")
            val message: String? = null,
            @SerialName("timestamp")
            val timestamp: String? = null,
            @SerialName("title")
            val title: String? = null,
            @SerialName("url")
            val url: String? = null
        ) {
            @Serializable
            data class Author(
                @SerialName("email")
                val email: String? = null,
                @SerialName("name")
                val name: String? = null
            )
        }

        @Serializable
        data class MergeParams(
            @SerialName("auto_merge_strategy")
            val autoMergeStrategy: String? = null,
            @SerialName("commit_message")
            val commitMessage: String? = null,
            @SerialName("sha")
            val sha: String? = null,
            @SerialName("should_remove_source_branch")
            val shouldRemoveSourceBranch: Boolean? = null,
            @SerialName("squash_commit_message")
            val squashCommitMessage: String? = null
        )

        @Serializable
        data class Source(
            @SerialName("avatar_url")
            val avatarUrl: String? = null,
            @SerialName("ci_config_path")
            val ciConfigPath: String? = null,
            @SerialName("default_branch")
            val defaultBranch: String? = null,
            @SerialName("description")
            val description: String? = null,
            @SerialName("git_http_url")
            val gitHttpUrl: String? = null,
            @SerialName("git_ssh_url")
            val gitSshUrl: String? = null,
            @SerialName("homepage")
            val homepage: String? = null,
            @SerialName("http_url")
            val httpUrl: String? = null,
            @SerialName("id")
            val id: Int? = null,
            @SerialName("name")
            val name: String? = null,
            @SerialName("namespace")
            val namespace: String? = null,
            @SerialName("path_with_namespace")
            val pathWithNamespace: String? = null,
            @SerialName("ssh_url")
            val sshUrl: String? = null,
            @SerialName("url")
            val url: String? = null,
            @SerialName("visibility_level")
            val visibilityLevel: Int? = null,
            @SerialName("web_url")
            val webUrl: String? = null
        )

        @Serializable
        data class Target(
            @SerialName("avatar_url")
            val avatarUrl: String? = null,
            @SerialName("ci_config_path")
            val ciConfigPath: String? = null,
            @SerialName("default_branch")
            val defaultBranch: String? = null,
            @SerialName("description")
            val description: String? = null,
            @SerialName("git_http_url")
            val gitHttpUrl: String? = null,
            @SerialName("git_ssh_url")
            val gitSshUrl: String? = null,
            @SerialName("homepage")
            val homepage: String? = null,
            @SerialName("http_url")
            val httpUrl: String? = null,
            @SerialName("id")
            val id: Int? = null,
            @SerialName("name")
            val name: String? = null,
            @SerialName("namespace")
            val namespace: String? = null,
            @SerialName("path_with_namespace")
            val pathWithNamespace: String? = null,
            @SerialName("ssh_url")
            val sshUrl: String? = null,
            @SerialName("url")
            val url: String? = null,
            @SerialName("visibility_level")
            val visibilityLevel: Int? = null,
            @SerialName("web_url")
            val webUrl: String? = null
        )
    }

    @Serializable
    data class Project(
        @SerialName("avatar_url")
        val avatarUrl: String? = null,
        @SerialName("ci_config_path")
        val ciConfigPath: String? = null,
        @SerialName("default_branch")
        val defaultBranch: String? = null,
        @SerialName("description")
        val description: String? = null,
        @SerialName("git_http_url")
        val gitHttpUrl: String? = null,
        @SerialName("git_ssh_url")
        val gitSshUrl: String? = null,
        @SerialName("homepage")
        val homepage: String? = null,
        @SerialName("http_url")
        val httpUrl: String? = null,
        @SerialName("id")
        val id: Int? = null,
        @SerialName("name")
        val name: String? = null,
        @SerialName("namespace")
        val namespace: String? = null,
        @SerialName("path_with_namespace")
        val pathWithNamespace: String? = null,
        @SerialName("ssh_url")
        val sshUrl: String? = null,
        @SerialName("url")
        val url: String? = null,
        @SerialName("visibility_level")
        val visibilityLevel: Int? = null,
        @SerialName("web_url")
        val webUrl: String? = null
    )

    @Serializable
    data class Repository(
        @SerialName("description")
        val description: String? = null,
        @SerialName("homepage")
        val homepage: String? = null,
        @SerialName("name")
        val name: String? = null,
        @SerialName("url")
        val url: String? = null
    )

    @Serializable
    data class User(
        @SerialName("avatar_url")
        val avatarUrl: String? = null,
        @SerialName("email")
        val email: String? = null,
        @SerialName("id")
        val id: Int? = null,
        @SerialName("name")
        val name: String? = null,
        @SerialName("username")
        val username: String? = null
    )
}