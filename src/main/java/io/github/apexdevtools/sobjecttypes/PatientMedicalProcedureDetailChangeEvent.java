/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PatientMedicalProcedureDetailChangeEvent extends SObject {
	public static SObjectType$<PatientMedicalProcedureDetailChangeEvent> SObjectType;
	public static SObjectFields$<PatientMedicalProcedureDetailChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DetailCodeId;
	public SObject DetailCode;
	public Id DetailRecordId;
	public SObject DetailRecord;
	public String DetailType;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PatientMedicalProcedureId;
	public PatientMedicalProcedure PatientMedicalProcedure;
	public String ReplayId;

	public PatientMedicalProcedureDetailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureDetailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedureDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
