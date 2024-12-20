/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LinkedArticle extends SObject {
	public static SObjectType$<LinkedArticle> SObjectType;
	public static SObjectFields$<LinkedArticle> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id KnowledgeArticleId;
	public Knowledge__ka KnowledgeArticle;
	public Id KnowledgeArticleVersionId;
	public Knowledge__kav KnowledgeArticleVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LinkedEntityId;
	public Name LinkedEntity;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LinkedArticleFeed[] Feeds;
	public LinkedArticleHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public NetworkActivityAudit[] ParentEntities;
	public TopicAssignment[] TopicAssignments;

	public LinkedArticle clone$() {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticle clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticle clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
