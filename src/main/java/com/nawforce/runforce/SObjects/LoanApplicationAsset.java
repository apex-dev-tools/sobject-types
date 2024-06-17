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
public class LoanApplicationAsset extends SObject {
	public static SObjectType$<LoanApplicationAsset> SObjectType;
	public static SObjectFields$<LoanApplicationAsset> Fields;

	public String AccountNumber;
	public String AccountType;
	public String AssetClass;
	public String AssetExtIdentifier;
	public String AssetType;
	public Decimal CashOrMarketValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DispositionType;
	public String FinancialInstitutionName;
	public Decimal GrossMonthlyRentalIncome;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsJointAsset;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String Name;
	public Decimal NetMonthlyRentalIncome;
	public Id OwnerId;
	public Name Owner;
	public Decimal PresentMarketValue;
	public Address RealEstateAddress;
	public String RealEstateCity;
	public String RealEstateCountry;
	public String RealEstateCountryCode;
	public String RealEstateGeocodeAccuracy;
	public Decimal RealEstateLatitude;
	public Decimal RealEstateLongitude;
	public Decimal RealEstateMonthlyExpense;
	public String RealEstatePostalCode;
	public String RealEstateState;
	public String RealEstateStateCode;
	public String RealEstateStreet;
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
	public LoanApplicationAssetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicationAssetHistory[] Histories;
	public LoanApplicantAsset[] LoanApplicantAssetRelations;
	public LoanApplicationLiability[] LoanApplicationLiabilities;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public LoanApplicationAssetShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicationAsset clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAsset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAsset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
