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
public class ClaimItem extends SObject {
	public static SObjectType$<ClaimItem> SObjectType;
	public static SObjectFields$<ClaimItem> Fields;

	public String Category;
	public Id ClaimId;
	public Claim Claim;
	public String ClaimInstanceIdentifier;
	public Id ClaimParticipantId;
	public ClaimParticipant ClaimParticipant;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Address CurrentAddress;
	public String CurrentCity;
	public String CurrentCountry;
	public String CurrentCountryCode;
	public String CurrentGeocodeAccuracy;
	public Decimal CurrentLatitude;
	public Decimal CurrentLongitude;
	public String CurrentPostalCode;
	public String CurrentState;
	public String CurrentStateCode;
	public String CurrentStreet;
	public String Description;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ProductId;
	public Product2 Product;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClaimCoverage[] ClaimCoverages;
	public ClaimItemAttribute[] ClaimItemAttributes;
	public ClaimItemRelatedObject[] ClaimItems;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ClaimItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClaimItemHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ClaimItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
