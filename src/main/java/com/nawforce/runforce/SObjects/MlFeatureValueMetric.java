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
public class MlFeatureValueMetric extends SObject {
	public static SObjectType$<MlFeatureValueMetric> SObjectType;
	public static SObjectFields$<MlFeatureValueMetric> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date Date;
	public String Feature;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MetricKey;
	public Decimal MetricValue;
	public String Name;
	public Datetime SystemModstamp;

	public MlFeatureValueMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public MlFeatureValueMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MlFeatureValueMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MlFeatureValueMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MlFeatureValueMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
