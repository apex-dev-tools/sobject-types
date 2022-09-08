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
public class KnowledgeArticleVersion extends SObject {
	public static SObjectType$<KnowledgeArticleVersion> SObjectType;
	public static SObjectFields$<KnowledgeArticleVersion> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Datetime ArchivedDate;
	public Id ArticleArchivedById;
	public User ArticleArchivedBy;
	public Datetime ArticleArchivedDate;
	public Integer ArticleCaseAttachCount;
	public Id ArticleCreatedById;
	public User ArticleCreatedBy;
	public Datetime ArticleCreatedDate;
	public String ArticleMasterLanguage;
	public String ArticleNumber;
	public Integer ArticleTotalViewCount;
	public String ArticleType;
	public Id AssignedById;
	public User AssignedBy;
	public Id AssignedToId;
	public Name AssignedTo;
	public Datetime AssignmentDate;
	public Datetime AssignmentDueDate;
	public String AssignmentNote;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime FirstPublishedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsLatestVersion;
	public Boolean IsVisibleInApp;
	public Boolean IsVisibleInCsp;
	public Boolean IsVisibleInPkb;
	public Boolean IsVisibleInPrm;
	public Id KnowledgeArticleId;
	public KnowledgeArticle KnowledgeArticle;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public String MigratedToFromArticleVersion;
	public Id OwnerId;
	public Name Owner;
	public String PublishStatus;
	public Id SourceId;
	public Case Source;
	public String Summary;
	public Datetime SystemModstamp;
	public String Title;
	public String UrlName;
	public Integer VersionNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CaseArticle[] CaseArticles;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public LinkedArticle[] LinkedArticles;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SearchPromotionRule[] SearchPromotionRules;
	public TopicAssignment[] TopicAssignments;

	public KnowledgeArticleVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
