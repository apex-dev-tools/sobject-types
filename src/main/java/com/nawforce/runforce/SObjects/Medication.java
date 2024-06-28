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
public class Medication extends SObject {
	public static SObjectType$<Medication> SObjectType;
	public static SObjectFields$<Medication> Fields;

	public Integer BatchNumber;
	public String BrandNameAlternative;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime ExpirationDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id ManufacturerId;
	public Account Manufacturer;
	public String MedicationCategory;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationFormId;
	public CodeSetBundle MedicationForm;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ProductId;
	public Product2 Product;
	public Decimal QuantityDenominator;
	public Decimal QuantityNumerator;
	public Id QuantityUnitId;
	public UnitOfMeasure QuantityUnit;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CareRequestDrug[] CareRequestDrugs;
	public ClinicalAlert[] ClinicalAlertSubjects;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationRequest[] MedReq_Medication;
	public MedicationStatement[] MedStat_Medication;
	public MedicationDispense[] MedicationDispense_Medications;
	public MedicinalIngredient[] MedicinalIngredientParent;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MedicationShare[] Shares;

	public Medication clone$() {throw new java.lang.UnsupportedOperationException();}
	public Medication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Medication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Medication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Medication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
