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
public class PatientHealthReaction extends SObject {
	public static SObjectType$<PatientHealthReaction> SObjectType;
	public static SObjectFields$<PatientHealthReaction> Fields;

	public Id CausativeSubstanceId;
	public CodeSetBundle CausativeSubstance;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Details;
	public Id ExposureRouteId;
	public CodeSetBundle ExposureRoute;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSelfReported;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id ManifestedSymptomId;
	public CodeSetBundle ManifestedSymptom;
	public String Name;
	public Id ObservationId;
	public CareObservation Observation;
	public Id ParentId;
	public Name Parent;
	public Datetime ReactionDateTime;
	public String Severity;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PatientHealthReactionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PatientHealthReactionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public PatientHealthReaction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReaction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReaction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
