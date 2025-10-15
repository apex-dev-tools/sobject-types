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
public class MedicationStatementChangeEvent extends SObject {
	public static SObjectType$<MedicationStatementChangeEvent> SObjectType;
	public static SObjectFields$<MedicationStatementChangeEvent> Fields;

	public Datetime AssertionDateTime;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeliverySetting;
	public String Division;
	public Datetime EndDateTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationReasonCodeId;
	public CodeSetBundle MedicationReasonCode;
	public Id MedicationReasonId;
	public SObject MedicationReason;
	public Id MedicationRequestId;
	public MedicationRequest MedicationRequest;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentMedicationStatementId;
	public MedicationStatement ParentMedicationStatement;
	public Id PatientId;
	public Account Patient;
	public Id ProcedureId;
	public PatientMedicalProcedure Procedure;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDateTime;
	public Id StatementSourceId;
	public SObject StatementSource;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;

	public MedicationStatementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
