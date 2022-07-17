package ar.edu.iua.web_services;

public class Cliente {

	public void ejemploCrearPlan() {

		String url = "http://localhost:8080/crearPlan";

		String plan2040 = """
				{
					"anio": 2040,
					"estado": "BORRADOR",
					"anios": [{
							"numero": 1,
							"nombre": "Primer anio",
							"materias": [{
									"codigo": 2040101,
									"nombre": "Lengua y Literatura I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040102,
									"nombre": "Lengua y Culturas Latinas I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040103,
									"nombre": "Ingles I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040104,
									"nombre": "Geografia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040105,
									"nombre": "Historia I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040106,
									"nombre": "Matematica I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040107,
									"nombre": "Plastica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040108,
									"nombre": "Musica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040109,
									"nombre": "Ciencias Naturales I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040110,
									"nombre": "Tecnicas de Trabajo Intelectual I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040111,
									"nombre": "Informatica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040112,
									"nombre": "Educacion Fisica I",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 2,
							"nombre": "Segundo anio",
							"materias": [{
									"codigo": 2040201,
									"nombre": "Lengua y Literatura Castellanas II",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040202,
									"nombre": "Lengua y Cultura Latinas II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040203,
									"nombre": "Lengua y Cultura Inglesas II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040204,
									"nombre": "Formacion Etica y Ciudadana II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040205,
									"nombre": "Geografia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040206,
									"nombre": "Historia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040207,
									"nombre": "Matematica II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040208,
									"nombre": "Formacion Plastica II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040209,
									"nombre": "Formacion Musical II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040210,
									"nombre": "Educacion para la Salud",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040211,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040212,
									"nombre": "Educacion Fisica y Deportes II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040213,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 3,
							"nombre": "Tercero anio",
							"materias": [{
									"codigo": 2040301,
									"nombre": "Lengua y Literatura III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040302,
									"nombre": "Lengua y Cultura Latinas III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040303,
									"nombre": "Ingles III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040304,
									"nombre": "Formacion Etica y Civica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040305,
									"nombre": "Geografia III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040306,
									"nombre": "Historia III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040307,
									"nombre": "Historia Del Arte I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040308,
									"nombre": "Plastica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040309,
									"nombre": "Musica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040310,
									"nombre": "Ciencias Naturales III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040311,
									"nombre": "Matematica III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040312,
									"nombre": "Educacion Fisica III",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 4,
							"nombre": "Cuarto anio",
							"materias": [{
									"codigo": 2040401,
									"nombre": "Lengua y Literatura Castellanas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040402,
									"nombre": "Lengua y Cultura Latinas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040403,
									"nombre": "Lengua y Cultura Inglesas IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040404,
									"nombre": "Geografia IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040405,
									"nombre": "Historia IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040406,
									"nombre": "Lengua y Cultura Francesas I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040407,
									"nombre": "Historia del Arte",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040408,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040409,
									"nombre": "Matematica IV",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040410,
									"nombre": "Biologia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040411,
									"nombre": "FisicoQuimica",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040412,
									"nombre": "Educacion Fisica y Escuadras I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040413,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040414,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 5,
							"nombre": "Quinto anio",
							"materias": [{
									"codigo": 2040501,
									"nombre": "Lengua y Literatura V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040502,
									"nombre": "Lengua y Cultura Latinas V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040503,
									"nombre": "Lengua y Cultura Griegas I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040504,
									"nombre": "Ingles V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040505,
									"nombre": "Frances I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040506,
									"nombre": "Geografia V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040507,
									"nombre": "Historia V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040508,
									"nombre": "Quimica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040509,
									"nombre": "Biologia II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040510,
									"nombre": "Matematica V  Algebra",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040511,
									"nombre": "Estadistica y Probabilidades",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040512,
									"nombre": "Educacion Fisica V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040513,
									"nombre": "Informatica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040514,
									"nombre": "Metodologia De La Investigacion",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040515,
									"nombre": "Filosofia I",
									"cargaHoraria": 2.0
								}
							]
						}
					]
				}

				                """;

	}

	public void ejemploModificarPlan (){

		String url = "http://localhost:8080/crearPlan";

		String plan2040 = """
				{
					"anio": 2040,
					"estado": "NO_ACTIVO",
					"anios": [{
							"numero": 1,
							"nombre": "Primer anio",
							"materias": [{
									"codigo": 2040101,
									"nombre": "Lengua y Literatura I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040102,
									"nombre": "Lengua y Culturas Latinas I",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040103,
									"nombre": "Ingles I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040104,
									"nombre": "Geografia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040105,
									"nombre": "Historia I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040106,
									"nombre": "Matematica I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040107,
									"nombre": "Plastica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040108,
									"nombre": "Musica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040109,
									"nombre": "Ciencias Naturales I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040110,
									"nombre": "Tecnicas de Trabajo Intelectual I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040111,
									"nombre": "Informatica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040112,
									"nombre": "Educacion Fisica I",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 2,
							"nombre": "Segundo anio",
							"materias": [{
									"codigo": 2040201,
									"nombre": "Lengua y Literatura Castellanas II",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040202,
									"nombre": "Lengua y Cultura Latinas II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040203,
									"nombre": "Lengua y Cultura Inglesas II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040204,
									"nombre": "Formacion Etica y Ciudadana II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040205,
									"nombre": "Geografia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040206,
									"nombre": "Historia II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040207,
									"nombre": "Matematica II",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040208,
									"nombre": "Formacion Plastica II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040209,
									"nombre": "Formacion Musical II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040210,
									"nombre": "Educacion para la Salud",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040211,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040212,
									"nombre": "Educacion Fisica y Deportes II",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040213,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 3,
							"nombre": "Tercero anio",
							"materias": [{
									"codigo": 2040301,
									"nombre": "Lengua y Literatura III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040302,
									"nombre": "Lengua y Cultura Latinas III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040303,
									"nombre": "Ingles III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040304,
									"nombre": "Formacion Etica y Civica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040305,
									"nombre": "Geografia III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040306,
									"nombre": "Historia III",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040307,
									"nombre": "Historia Del Arte I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040308,
									"nombre": "Plastica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040309,
									"nombre": "Musica III",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040310,
									"nombre": "Ciencias Naturales III",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040311,
									"nombre": "Matematica III",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040312,
									"nombre": "Educacion Fisica III",
									"cargaHoraria": 2.0
								}
							]
						},
						{
							"numero": 4,
							"nombre": "Cuarto anio",
							"materias": [{
									"codigo": 2040401,
									"nombre": "Lengua y Literatura Castellanas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040402,
									"nombre": "Lengua y Cultura Latinas IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040403,
									"nombre": "Lengua y Cultura Inglesas IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040404,
									"nombre": "Geografia IV",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040405,
									"nombre": "Historia IV",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040406,
									"nombre": "Lengua y Cultura Francesas I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040407,
									"nombre": "Historia del Arte",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040408,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040409,
									"nombre": "Matematica IV",
									"cargaHoraria": 5.0
								},
								{
									"codigo": 2040410,
									"nombre": "Biologia I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040411,
									"nombre": "FisicoQuimica",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040412,
									"nombre": "Educacion Fisica y Escuadras I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040413,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040414,
									"nombre": "Materia Optativa",
									"cargaHoraria": 3.0
								}
							]
						},
						{
							"numero": 5,
							"nombre": "Quinto anio",
							"materias": [{
									"codigo": 2040501,
									"nombre": "Lengua y Literatura V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040502,
									"nombre": "Lengua y Cultura Latinas V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040503,
									"nombre": "Lengua y Cultura Griegas I",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040504,
									"nombre": "Ingles V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040505,
									"nombre": "Frances I",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040506,
									"nombre": "Geografia V",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040507,
									"nombre": "Historia V",
									"cargaHoraria": 4.0
								},
								{
									"codigo": 2040508,
									"nombre": "Quimica I",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040509,
									"nombre": "Biologia II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040510,
									"nombre": "Matematica V  Algebra",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040511,
									"nombre": "Estadistica y Probabilidades",
									"cargaHoraria": 3.0
								},
								{
									"codigo": 2040512,
									"nombre": "Educacion Fisica V",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040513,
									"nombre": "Informatica II",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040514,
									"nombre": "Metodologia De La Investigacion",
									"cargaHoraria": 2.0
								},
								{
									"codigo": 2040515,
									"nombre": "Filosofia I",
									"cargaHoraria": 2.0
								}
							]
						}
					]
				}

				                """;
	}
}