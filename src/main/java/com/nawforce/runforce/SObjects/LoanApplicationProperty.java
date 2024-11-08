/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoanApplicationProperty extends SObject {
	public static SObjectType$<LoanApplicationProperty> SObjectType;
	public static SObjectFields$<LoanApplicationProperty> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal ExpMonthlyRentalIncome;
	public Decimal ExpNetMonthlyRentalInc;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsManufacturedHome;
	public Boolean IsMixedUseProperty;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String LoanPurposeType;
	public String Name;
	public Address PropertyAddress;
	public String PropertyCity;
	public String PropertyCountry;
	public String PropertyCountryCode;
	public String PropertyExtIdentifier;
	public String PropertyGeocodeAccuracy;
	public Decimal PropertyLatitude;
	public Decimal PropertyLongitude;
	public String PropertyPostalCode;
	public String PropertyState;
	public String PropertyStateCode;
	public String PropertyStreet;
	public String PropertyUseType;
	public Decimal PropertyValue;
	public Decimal RequestedLoanAmount;
	public Datetime SystemModstamp;
	public Integer UnitsFinancedCount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
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
	public LoanApplicationPropertyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicationPropertyHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicationProperty clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationProperty clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationProperty clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationProperty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationProperty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
