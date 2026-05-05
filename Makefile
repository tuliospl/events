.PHONY: up down logs build package restart ps test

up:
	docker compose up --build --force-recreate -d

down:
	docker compose down

logs:
	docker compose logs -f

build: package

package:
	docker compose build --no-cache app

restart:
	docker compose restart

ps:
	docker compose ps

test:
	./mvnw test
