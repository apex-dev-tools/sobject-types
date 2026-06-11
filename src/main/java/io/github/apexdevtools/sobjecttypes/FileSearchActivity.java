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
public class FileSearchActivity extends SObject {
	public static SObjectType$<FileSearchActivity> SObjectType;
	public static SObjectFields$<FileSearchActivity> Fields;

	public Decimal AvgNumResults;
	public Decimal ClickRank;
	public Integer CountQueries;
	public Integer CountUsers;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Period;
	public Date QueryDate;
	public String QueryLanguage;
	public String SearchTerm;
	public Datetime SystemModstamp;

	public FileSearchActivity clone$() {throw new java.lang.UnsupportedOperationException();}
	public FileSearchActivity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FileSearchActivity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FileSearchActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FileSearchActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
