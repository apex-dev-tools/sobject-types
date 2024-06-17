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
public class RegulatoryAuthorizationType extends SObject {
	public static SObjectType$<RegulatoryAuthorizationType> SObjectType;
	public static SObjectFields$<RegulatoryAuthorizationType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DurationType;
	public Id Id;
	public Boolean IsDeleted;
	public Id IssuingDepartmentId;
	public RegulatoryAuthority IssuingDepartment;
	public String Jurisdiction;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessingDuration;
	public String RegulatoryAuthCategory;
	public String RegulatoryAuthCode;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public BusinessLicenseApplication[] BusinessLicenseApplicationsLicenseType;
	public BusinessLicense[] BusinessLicenses;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public RegulatoryAuthorizationTypeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RegulatoryAuthorizationTypeHistory[] Histories;
	public IndividualApplication[] IndividualApplicationLicenseType;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RegAuthorizationTypeProduct[] ProductRegulatoryAuthorizationType;
	public BusRegAuthorizationType[] RegulatoryAuthAndBusinessTypeRelations;
	public RegulatoryAuthorizationTypeShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public RegulatoryAuthorizationType clone$() {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthorizationType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthorizationType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthorizationType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryAuthorizationType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
