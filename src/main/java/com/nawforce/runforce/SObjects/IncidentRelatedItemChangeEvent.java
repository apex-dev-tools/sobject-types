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
public class IncidentRelatedItemChangeEvent extends SObject {
	public static SObjectType$<IncidentRelatedItemChangeEvent> SObjectType;
	public static SObjectFields$<IncidentRelatedItemChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public String Comment;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public String ImpactLevel;
	public String ImpactType;
	public Id IncidentId;
	public Incident Incident;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id Product2Id;
	public Product2 Product2;
	public String ReplayId;

	public IncidentRelatedItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IncidentRelatedItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IncidentRelatedItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IncidentRelatedItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IncidentRelatedItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
