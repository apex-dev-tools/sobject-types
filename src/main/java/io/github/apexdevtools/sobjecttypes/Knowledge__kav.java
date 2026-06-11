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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

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
	public io.github.apexdevtools.standardtypes.System.Integer ArticleCaseAttachCount;
	public Id ArticleCreatedById;
	public User ArticleCreatedBy;
	public Datetime ArticleCreatedDate;
	public io.github.apexdevtools.standardtypes.System.String ArticleMasterLanguage;
	public io.github.apexdevtools.standardtypes.System.String ArticleNumber;
	public io.github.apexdevtools.standardtypes.System.Integer ArticleTotalViewCount;
	public io.github.apexdevtools.standardtypes.System.String ArticleType;
	public Id AssignedById;
	public User AssignedBy;
	public Id AssignedToId;
	public Name AssignedTo;
	public Datetime AssignmentDate;
	public Datetime AssignmentDueDate;
	public io.github.apexdevtools.standardtypes.System.String AssignmentNote;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public Datetime FirstPublishedDate;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public io.github.apexdevtools.standardtypes.System.Boolean IsLatestVersion;
	public io.github.apexdevtools.standardtypes.System.Boolean IsVisibleInApp;
	public io.github.apexdevtools.standardtypes.System.Boolean IsVisibleInCsp;
	public io.github.apexdevtools.standardtypes.System.Boolean IsVisibleInPkb;
	public io.github.apexdevtools.standardtypes.System.Boolean IsVisibleInPrm;
	public Id KnowledgeArticleId;
	public Knowledge__ka KnowledgeArticle;
	public io.github.apexdevtools.standardtypes.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public io.github.apexdevtools.standardtypes.System.String MigratedToFromArticleVersion;
	public Id OwnerId;
	public Name Owner;
	public io.github.apexdevtools.standardtypes.System.String PublishStatus;
	public Id SourceId;
	public Case Source;
	public io.github.apexdevtools.standardtypes.System.String Summary;
	public Datetime SystemModstamp;
	public io.github.apexdevtools.standardtypes.System.String Title;
	public io.github.apexdevtools.standardtypes.System.String UrlName;
	public io.github.apexdevtools.standardtypes.System.Integer VersionNumber;

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
	public Knowledge__kav clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__kav clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
