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
public class EventLogFile extends SObject {
	public static SObjectType$<EventLogFile> SObjectType;
	public static SObjectFields$<EventLogFile> Fields;

	public Decimal ApiVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventType;
	public Id Id;
	public String Interval;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LogDate;
	public Blob LogFile;
	public String LogFileContentType;
	public String LogFileFieldNames;
	public String LogFileFieldTypes;
	public Decimal LogFileLength;
	public Integer Sequence;
	public Datetime SystemModstamp;

	public EventLogFile clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventLogFile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
