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
public class OmniUiCard extends SObject {
	public static SObjectType$<OmniUiCard> SObjectType;
	public static SObjectFields$<OmniUiCard> Fields;

	public String AuthorName;
	public String ClonedFromOmniUiCardKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataSourceConfig;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsTrackingEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Namespace;
	public String OmniUiCardKey;
	public String OmniUiCardType;
	public String OverrideKey;
	public Id OwnerId;
	public Name Owner;
	public String PropertySetConfig;
	public String SampleDataSourceResponse;
	public String StylingConfiguration;
	public Datetime SystemModstamp;
	public String UniqueName;
	public Decimal VersionNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniUiCardFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OmniUiCardShare[] Shares;

	public OmniUiCard clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniUiCard clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniUiCard clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniUiCard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniUiCard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
