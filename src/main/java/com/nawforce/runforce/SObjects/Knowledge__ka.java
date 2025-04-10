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
public class Knowledge__ka extends SObject {
	public static SObjectType$<Knowledge__ka> SObjectType;
	public static SObjectFields$<Knowledge__ka> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Datetime ArchivedDate;
	public com.nawforce.runforce.System.String ArticleNumber;
	public com.nawforce.runforce.System.Integer CaseAssociationCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime FirstPublishedDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String MigratedToFromArticle;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer TotalViewCount;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CaseArticle[] CaseArticles;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LinkedArticle[] LinkedArticles;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Knowledge__ViewStat[] ViewStats;
	public Knowledge__VoteStat[] VoteStats;
	public Vote[] Votes;

	public Knowledge__ka clone$() {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ka clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ka clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ka clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ka clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
