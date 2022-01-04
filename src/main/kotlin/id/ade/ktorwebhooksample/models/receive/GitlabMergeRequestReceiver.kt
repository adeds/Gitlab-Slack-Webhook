package id.ade.ktorwebhooksample.models.receive


import com.google.gson.annotations.SerializedName

data class GitlabMergeRequestReceiver(
    @SerializedName("assignees")
    val assignees: List<Assignee?>? = null,
    @SerializedName("changes")
    val changes: Changes? = null,
    @SerializedName("event_type")
    val eventType: String? = null,
    @SerializedName("labels")
    val labels: List<Any?>? = null,
    @SerializedName("object_attributes")
    val objectAttributes: ObjectAttributes? = null,
    @SerializedName("object_kind")
    val objectKind: String? = null,
    @SerializedName("project")
    val project: Project? = null,
    @SerializedName("repository")
    val repository: Repository? = null,
    @SerializedName("user")
    val user: User? = null
) {
    data class Assignee(
        @SerializedName("avatar_url")
        val avatarUrl: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("username")
        val username: String? = null
    )

    class Changes

    data class ObjectAttributes(
        @SerializedName("assignee_id")
        val assigneeId: Int? = null,
        @SerializedName("assignee_ids")
        val assigneeIds: List<Int?>? = null,
        @SerializedName("author_id")
        val authorId: Int? = null,
        @SerializedName("blocking_discussions_resolved")
        val blockingDiscussionsResolved: Boolean? = null,
        @SerializedName("created_at")
        val createdAt: String? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("head_pipeline_id")
        val headPipelineId: Int? = null,
        @SerializedName("human_time_change")
        val humanTimeChange: Any? = null,
        @SerializedName("human_time_estimate")
        val humanTimeEstimate: Any? = null,
        @SerializedName("human_total_time_spent")
        val humanTotalTimeSpent: Any? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("iid")
        val iid: Int? = null,
        @SerializedName("last_commit")
        val lastCommit: LastCommit? = null,
        @SerializedName("last_edited_at")
        val lastEditedAt: Any? = null,
        @SerializedName("last_edited_by_id")
        val lastEditedById: Any? = null,
        @SerializedName("merge_commit_sha")
        val mergeCommitSha: String? = null,
        @SerializedName("merge_error")
        val mergeError: Any? = null,
        @SerializedName("merge_params")
        val mergeParams: MergeParams? = null,
        @SerializedName("merge_status")
        val mergeStatus: String? = null,
        @SerializedName("merge_user_id")
        val mergeUserId: Int? = null,
        @SerializedName("merge_when_pipeline_succeeds")
        val mergeWhenPipelineSucceeds: Boolean? = null,
        @SerializedName("milestone_id")
        val milestoneId: Any? = null,
        @SerializedName("source")
        val source: Source? = null,
        @SerializedName("source_branch")
        val sourceBranch: String? = null,
        @SerializedName("source_project_id")
        val sourceProjectId: Int? = null,
        @SerializedName("state")
        val state: String? = null,
        @SerializedName("state_id")
        val stateId: Int? = null,
        @SerializedName("target")
        val target: Target? = null,
        @SerializedName("target_branch")
        val targetBranch: String? = null,
        @SerializedName("target_project_id")
        val targetProjectId: Int? = null,
        @SerializedName("time_change")
        val timeChange: Int? = null,
        @SerializedName("time_estimate")
        val timeEstimate: Int? = null,
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("total_time_spent")
        val totalTimeSpent: Int? = null,
        @SerializedName("updated_at")
        val updatedAt: String? = null,
        @SerializedName("updated_by_id")
        val updatedById: Any? = null,
        @SerializedName("url")
        val url: String? = null,
        @SerializedName("work_in_progress")
        val workInProgress: Boolean? = null
    ) {
        data class LastCommit(
            @SerializedName("author")
            val author: Author? = null,
            @SerializedName("id")
            val id: String? = null,
            @SerializedName("message")
            val message: String? = null,
            @SerializedName("timestamp")
            val timestamp: String? = null,
            @SerializedName("title")
            val title: String? = null,
            @SerializedName("url")
            val url: String? = null
        ) {
            data class Author(
                @SerializedName("email")
                val email: String? = null,
                @SerializedName("name")
                val name: String? = null
            )
        }

        data class MergeParams(
            @SerializedName("auto_merge_strategy")
            val autoMergeStrategy: String? = null,
            @SerializedName("commit_message")
            val commitMessage: String? = null,
            @SerializedName("sha")
            val sha: String? = null,
            @SerializedName("should_remove_source_branch")
            val shouldRemoveSourceBranch: Boolean? = null,
            @SerializedName("squash_commit_message")
            val squashCommitMessage: String? = null
        )

        data class Source(
            @SerializedName("avatar_url")
            val avatarUrl: Any? = null,
            @SerializedName("ci_config_path")
            val ciConfigPath: String? = null,
            @SerializedName("default_branch")
            val defaultBranch: String? = null,
            @SerializedName("description")
            val description: String? = null,
            @SerializedName("git_http_url")
            val gitHttpUrl: String? = null,
            @SerializedName("git_ssh_url")
            val gitSshUrl: String? = null,
            @SerializedName("homepage")
            val homepage: String? = null,
            @SerializedName("http_url")
            val httpUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("namespace")
            val namespace: String? = null,
            @SerializedName("path_with_namespace")
            val pathWithNamespace: String? = null,
            @SerializedName("ssh_url")
            val sshUrl: String? = null,
            @SerializedName("url")
            val url: String? = null,
            @SerializedName("visibility_level")
            val visibilityLevel: Int? = null,
            @SerializedName("web_url")
            val webUrl: String? = null
        )

        data class Target(
            @SerializedName("avatar_url")
            val avatarUrl: Any? = null,
            @SerializedName("ci_config_path")
            val ciConfigPath: String? = null,
            @SerializedName("default_branch")
            val defaultBranch: String? = null,
            @SerializedName("description")
            val description: String? = null,
            @SerializedName("git_http_url")
            val gitHttpUrl: String? = null,
            @SerializedName("git_ssh_url")
            val gitSshUrl: String? = null,
            @SerializedName("homepage")
            val homepage: String? = null,
            @SerializedName("http_url")
            val httpUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("namespace")
            val namespace: String? = null,
            @SerializedName("path_with_namespace")
            val pathWithNamespace: String? = null,
            @SerializedName("ssh_url")
            val sshUrl: String? = null,
            @SerializedName("url")
            val url: String? = null,
            @SerializedName("visibility_level")
            val visibilityLevel: Int? = null,
            @SerializedName("web_url")
            val webUrl: String? = null
        )
    }

    data class Project(
        @SerializedName("avatar_url")
        val avatarUrl: Any? = null,
        @SerializedName("ci_config_path")
        val ciConfigPath: String? = null,
        @SerializedName("default_branch")
        val defaultBranch: String? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("git_http_url")
        val gitHttpUrl: String? = null,
        @SerializedName("git_ssh_url")
        val gitSshUrl: String? = null,
        @SerializedName("homepage")
        val homepage: String? = null,
        @SerializedName("http_url")
        val httpUrl: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("namespace")
        val namespace: String? = null,
        @SerializedName("path_with_namespace")
        val pathWithNamespace: String? = null,
        @SerializedName("ssh_url")
        val sshUrl: String? = null,
        @SerializedName("url")
        val url: String? = null,
        @SerializedName("visibility_level")
        val visibilityLevel: Int? = null,
        @SerializedName("web_url")
        val webUrl: String? = null
    )

    data class Repository(
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("homepage")
        val homepage: String? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("url")
        val url: String? = null
    )

    data class User(
        @SerializedName("avatar_url")
        val avatarUrl: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("username")
        val username: String? = null
    )
}