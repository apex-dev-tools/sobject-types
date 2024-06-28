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
public class PatientHealthReactionChangeEvent extends SObject {
	public static SObjectType$<PatientHealthReactionChangeEvent> SObjectType;
	public static SObjectFields$<PatientHealthReactionChangeEvent> Fields;

	public Id CausativeSubstanceId;
	public CodeSetBundle CausativeSubstance;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Details;
	public Id ExposureRouteId;
	public CodeSetBundle ExposureRoute;
	public Id Id;
	public Boolean IsSelfReported;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ManifestedSymptomId;
	public CodeSetBundle ManifestedSymptom;
	public String Name;
	public Id ObservationId;
	public CareObservation Observation;
	public Id ParentId;
	public SObject Parent;
	public Datetime ReactionDateTime;
	public String ReplayId;
	public String Severity;

	public PatientHealthReactionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReactionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientHealthReactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
