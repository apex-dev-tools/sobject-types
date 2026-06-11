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
public class CspViolation extends SObject {
	public static SObjectType$<CspViolation> SObjectType;
	public static SObjectFields$<CspViolation> Fields;

	public String BlockedUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsConnectSrcViolated;
	public Boolean IsDeleted;
	public Boolean IsFontSrcViolated;
	public Boolean IsFrameSrcViolated;
	public Boolean IsImageSrcViolated;
	public Boolean IsMediaSrcViolated;
	public Boolean IsStyleSrcViolated;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String ViolationContext;

	public CspViolation clone$() {throw new java.lang.UnsupportedOperationException();}
	public CspViolation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CspViolation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CspViolation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CspViolation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
