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
public class OmniDataPack extends SObject {
	public static SObjectType$<OmniDataPack> SObjectType;
	public static SObjectFields$<OmniDataPack> Fields;

	public String ActionType;
	public String ActivationStatus;
	public String AsyncApexJobIdentifier;
	public String AsyncJobStatus;
	public String Component;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsAddedToMultiPack;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MultiPackUpdatedById;
	public User MultiPackUpdatedBy;
	public Datetime MultiPackUpdatedDateTime;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessStatus;
	public String Source;
	public Datetime SystemModstamp;
	public Decimal Version;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniDataPackFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OmniDataPackShare[] Shares;

	public OmniDataPack clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniDataPack clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataPack clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataPack clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataPack clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
