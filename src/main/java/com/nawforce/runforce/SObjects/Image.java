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
public class Image extends SObject {
	public static SObjectType$<Image> SObjectType;
	public static SObjectFields$<Image> Fields;

	public com.nawforce.runforce.System.String AlternateText;
	public com.nawforce.runforce.System.String CapturedAngle;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id Id;
	public com.nawforce.runforce.System.String ImageClass;
	public com.nawforce.runforce.System.String ImageClassObjectType;
	public com.nawforce.runforce.System.String ImageViewType;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String Url;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ImageFeed[] Feeds;
	public ImageHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ImageShare[] Shares;
	public Task[] Tasks;

	public Image clone$() {throw new java.lang.UnsupportedOperationException();}
	public Image clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Image clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Image clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Image clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
