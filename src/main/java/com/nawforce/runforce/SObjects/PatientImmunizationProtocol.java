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
public class PatientImmunizationProtocol extends SObject {
	public static SObjectType$<PatientImmunizationProtocol> SObjectType;
	public static SObjectFields$<PatientImmunizationProtocol> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrentDose;
	public String Division;
	public Id Id;
	public String ImmunizationRecommendation;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientImmunizationId;
	public PatientImmunization PatientImmunization;
	public String RecommendedDoses;
	public String RecommendingAuthority;
	public Datetime SystemModstamp;
	public Id TargetDisease1CodeId;
	public CodeSetBundle TargetDisease1Code;
	public Id TargetDisease2CodeId;
	public CodeSetBundle TargetDisease2Code;
	public Id TargetDisease3CodeId;
	public CodeSetBundle TargetDisease3Code;
	public Id TargetDisease4CodeId;
	public CodeSetBundle TargetDisease4Code;
	public Id TargetDisease5CodeId;
	public CodeSetBundle TargetDisease5Code;
	public Id TargetDisease6CodeId;
	public CodeSetBundle TargetDisease6Code;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PatientImmunizationProtocolFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PatientImmunizationProtocolHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PatientImmunizationProtocolShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PatientImmunizationProtocol clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocol clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocol clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocol clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocol clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
