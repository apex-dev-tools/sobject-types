/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkCoachingShare extends SObject {
	public static SObjectType$<WorkCoachingShare> SObjectType;
	public static SObjectFields$<WorkCoachingShare> Fields;

	public io.github.apexdevtools.standardtypes.System.String AccessLevel;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public WorkCoaching Parent;
	public io.github.apexdevtools.standardtypes.System.String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public WorkCoachingShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkCoachingShare clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkCoachingShare clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkCoachingShare clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkCoachingShare clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
