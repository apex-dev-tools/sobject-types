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
public class OmniScriptSavedSession extends SObject {
	public static SObjectType$<OmniScriptSavedSession> SObjectType;
	public static SObjectFields$<OmniScriptSavedSession> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FileBasedOmniScriptName;
	public Id Id;
	public Boolean IsContentEncoded;
	public Boolean IsDeleted;
	public Boolean IsWebCompEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSavedDateTime;
	public Datetime LastViewedDate;
	public String Name;
	public Id OmniScriptId;
	public OmniProcess OmniScript;
	public String OmniScriptLanguage;
	public String OmniScriptLocaleCode;
	public String OmniScriptSubType;
	public String OmniScriptType;
	public Decimal OmniScriptVersionNumber;
	public Id OwnerId;
	public Name Owner;
	public String RelatedLabel;
	public String RelatedName;
	public String RelatedRecordIdentifier;
	public String RelatedType;
	public String RelativeResumeUrl;
	public String ResumeUrl;
	public String SavedSessionKey;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniScriptSavedSessionFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OmniScriptSavedSessionShare[] Shares;

	public OmniScriptSavedSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptSavedSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptSavedSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptSavedSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptSavedSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
