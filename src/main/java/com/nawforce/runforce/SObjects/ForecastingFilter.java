/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingFilter extends SObject {
	public static SObjectType$<ForecastingFilter> SObjectType;
	public static SObjectFields$<ForecastingFilter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String FilterLogic;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id ForecastingTypeSourceId;
	public ForecastingTypeSource ForecastingTypeSource;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime SystemModstamp;

	public ForecastingFilter clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
