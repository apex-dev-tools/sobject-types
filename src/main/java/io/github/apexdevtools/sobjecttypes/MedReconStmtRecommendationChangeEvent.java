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
public class MedReconStmtRecommendationChangeEvent extends SObject {
	public static SObjectType$<MedReconStmtRecommendationChangeEvent> SObjectType;
	public static SObjectFields$<MedReconStmtRecommendationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedReconRecommendationId;
	public MedReconRecommendation MedReconRecommendation;
	public Id MedicationReconciliationId;
	public MedicationReconciliation MedicationReconciliation;
	public Id MedicationStatementId;
	public MedicationStatement MedicationStatement;
	public String Name;
	public String ReplayId;
	public Datetime SourceSysModifiedDateTime;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public MedReconStmtRecommendationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedReconStmtRecommendationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedReconStmtRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedReconStmtRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedReconStmtRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
