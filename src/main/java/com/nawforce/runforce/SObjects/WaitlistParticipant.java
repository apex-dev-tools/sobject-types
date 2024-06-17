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
public class WaitlistParticipant extends SObject {
	public static SObjectType$<WaitlistParticipant> SObjectType;
	public static SObjectFields$<WaitlistParticipant> Fields;

	public Datetime AcceptanceTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id ParticipantId;
	public Name Participant;
	public String ParticipantIdentifier;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public String Status;
	public Datetime SystemModstamp;
	public Id WaitlistId;
	public Waitlist Waitlist;
	public Id WorkTypeId;
	public WorkType WorkType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WaitlistParticipantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WaitlistParticipantHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public WaitlistParticipant clone$() {throw new java.lang.UnsupportedOperationException();}
	public WaitlistParticipant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WaitlistParticipant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WaitlistParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WaitlistParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
