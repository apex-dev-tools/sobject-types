/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class KnowledgeArticle extends SObject {
	public static SObjectType$<KnowledgeArticle> SObjectType;
	public static SObjectFields$<KnowledgeArticle> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Datetime ArchivedDate;
	public String ArticleNumber;
	public Integer CaseAssociationCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime FirstPublishedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MigratedToFromArticle;
	public Datetime SystemModstamp;
	public Integer TotalViewCount;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CaseArticle[] CaseArticles;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LinkedArticle[] LinkedArticles;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public KnowledgeArticleVersionHistory[] VersionHistories;
	public KnowledgeArticleViewStat[] ViewStats;
	public KnowledgeArticleVoteStat[] VoteStats;
	public Vote[] Votes;

	public KnowledgeArticle clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticle clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticle clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
