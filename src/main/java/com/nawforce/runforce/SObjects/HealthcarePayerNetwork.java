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
public class HealthcarePayerNetwork extends SObject {
	public static SObjectType$<HealthcarePayerNetwork> SObjectType;
	public static SObjectFields$<HealthcarePayerNetwork> Fields;

	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LineofBusiness;
	public String Name;
	public String NetworkType;
	public Id OwnerId;
	public Name Owner;
	public Id ParentPayerNetworkId;
	public HealthcarePayerNetwork ParentPayerNetwork;
	public Id PayerId;
	public Account Payer;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthcarePayerNetworkFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcareFacilityNetwork[] Healthcare_Facility_Networks;
	public HealthcarePayerNetworkHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public HealthcarePayerNetwork[] ParentHealthcarePayerNetwork;
	public MemberPlan[] PayerNetworks;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProviderNetworkContract[] ProviderNetworkContracts;
	public ProviderNetworkTier[] ProviderNetworkTiers;
	public HealthcarePayerNetworkShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HealthcarePayerNetwork clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetwork clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetwork clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetwork clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcarePayerNetwork clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
