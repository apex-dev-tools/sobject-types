/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ApexTestResultLimits extends SObject {
	public static SObjectType$<ApexTestResultLimits> SObjectType;
	public static SObjectFields$<ApexTestResultLimits> Fields;

	public Id ApexTestResultId;
	public ApexTestResult ApexTestResult;
	public Integer AsyncCalls;
	public Integer Callouts;
	public Integer Cpu;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer Dml;
	public Integer DmlRows;
	public Integer Email;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LimitContext;
	public String LimitExceptions;
	public Integer MobilePush;
	public Integer QueryRows;
	public Integer Soql;
	public Integer Sosl;
	public Datetime SystemModstamp;

	public ApexTestResultLimits clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResultLimits clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResultLimits clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResultLimits clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResultLimits clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
