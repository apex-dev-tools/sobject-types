/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Knowledge__kav extends SObject {
	public static SObjectType$<Knowledge__kav> SObjectType;
	public static SObjectFields$<Knowledge__kav> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Datetime ArchivedDate;
	public Id ArticleArchivedById;
	public User ArticleArchivedBy;
	public Datetime ArticleArchivedDate;
	public com.nawforce.runforce.System.Integer ArticleCaseAttachCount;
	public Id ArticleCreatedById;
	public User ArticleCreatedBy;
	public Datetime ArticleCreatedDate;
	public com.nawforce.runforce.System.String ArticleMasterLanguage;
	public com.nawforce.runforce.System.String ArticleNumber;
	public com.nawforce.runforce.System.Integer ArticleTotalViewCount;
	public com.nawforce.runforce.System.String ArticleType;
	public Id AssignedById;
	public User AssignedBy;
	public Id AssignedToId;
	public Name AssignedTo;
	public Datetime AssignmentDate;
	public Datetime AssignmentDueDate;
	public com.nawforce.runforce.System.String AssignmentNote;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Datetime FirstPublishedDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsLatestVersion;
	public com.nawforce.runforce.System.Boolean IsVisibleInApp;
	public com.nawforce.runforce.System.Boolean IsVisibleInCsp;
	public com.nawforce.runforce.System.Boolean IsVisibleInPkb;
	public com.nawforce.runforce.System.Boolean IsVisibleInPrm;
	public Id KnowledgeArticleId;
	public Knowledge__ka KnowledgeArticle;
	public com.nawforce.runforce.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public com.nawforce.runforce.System.String MigratedToFromArticleVersion;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String PublishStatus;
	public Id SourceId;
	public Case Source;
	public com.nawforce.runforce.System.String Summary;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String UrlName;
	public com.nawforce.runforce.System.Integer VersionNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CaseArticle[] CaseArticles;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Knowledge__DataCategorySelection[] DataCategorySelections;
	public LinkedArticle[] LinkedArticles;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SearchPromotionRule[] SearchPromotionRules;
	public TopicAssignment[] TopicAssignments;

	public Knowledge__kav clone$() {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
