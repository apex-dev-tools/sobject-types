/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
