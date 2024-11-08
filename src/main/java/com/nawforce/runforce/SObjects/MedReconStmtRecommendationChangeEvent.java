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
