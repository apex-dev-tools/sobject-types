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
public class MedReconRecommendationChangeEvent extends SObject {
	public static SObjectType$<MedReconRecommendationChangeEvent> SObjectType;
	public static SObjectFields$<MedReconRecommendationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationReconciliationId;
	public MedicationReconciliation MedicationReconciliation;
	public String Name;
	public String NoteForPatient;
	public String NoteForProvider;
	public String Priority;
	public String RecommendationReasonSubtype;
	public String RecommendationReasonType;
	public String RecommendationSubtype;
	public String RecommendationType;
	public String ReplayId;
	public Datetime SourceSysModifiedDateTime;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public MedReconRecommendationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedReconRecommendationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedReconRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedReconRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedReconRecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
