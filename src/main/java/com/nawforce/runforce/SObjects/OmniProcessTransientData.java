/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OmniProcessTransientData extends SObject {
	public static SObjectType$<OmniProcessTransientData> SObjectType;
	public static SObjectFields$<OmniProcessTransientData> Fields;

	public String AsyncApexJobIdentifier;
	public String AsyncTransactionIdentifier;
	public String AsyncTransactionStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorMessage;
	public String GlobalKey;
	public Id Id;
	public String InputData;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessKey;
	public String ProcessMetadata;
	public String ProcessStatus;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniProcessTransientDataFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OmniProcessTransientDataShare[] Shares;

	public OmniProcessTransientData clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessTransientData clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessTransientData clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessTransientData clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessTransientData clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
